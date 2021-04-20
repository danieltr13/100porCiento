/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresion;

import dominio.Pedido;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;

/**
 *
 * @author Alfon
 */
public class BillPrintable implements Printable {

    private Pedido pedido;

    public BillPrintable(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
            throws PrinterException {

        int result = NO_SUCH_PAGE;
        if (pageIndex == 0) {

            Graphics2D g2d = (Graphics2D) graphics;

            double width = pageFormat.getImageableWidth();

            g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

            ////////// code by alqama//////////////
            FontMetrics metrics = g2d.getFontMetrics(new Font("Arial", Font.BOLD, 7));
            //    int idLength=metrics.stringWidth("000000");
            //int idLength=metrics.stringWidth("00");
            int idLength = metrics.stringWidth("000");
            int amtLength = metrics.stringWidth("000000");
            int qtyLength = metrics.stringWidth("00000");
            int priceLength = metrics.stringWidth("000000");
            int prodLength = (int) width - idLength - amtLength - qtyLength - priceLength - 17;
            int productPosition = 0;
            int discountPosition = prodLength + 5;
            int pricePosition = discountPosition + idLength + 10;
            int qtyPosition = pricePosition + priceLength + 4;
            int amtPosition = qtyPosition + qtyLength;

            try {
                /*Draw Header*/
                int y = 20;
                int yShift = 10;
                int headerRectHeight = 15;
                int headerRectHeighta = 40;

                g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                g2d.drawString("-------------------------------------", 12, y);
                y += yShift;
                g2d.drawString("            100 porciento           ", 12, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 12, y);
                y += headerRectHeight;

                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" producto                 precio ", 10, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 10, y);
                y += headerRectHeight;
                String nota="";
                for (int i = 0; i < pedido.getDetallePedido().size(); i++) {
                    nota= pedido.getDetallePedido().get(i).getNota();
                    if (nota.equalsIgnoreCase("")) {
                        nota="Ninguna";
                    }
                    for (int j = 0; j < pedido.getDetallePedido().get(i).getCantidad(); j++) {
                        g2d.drawString(" " + 
                                String.format("%10s", pedido.getDetallePedido().get(i).getProducto().getNombre())
                                + String.format("%20s", pedido.getDetallePedido().get(i).getProducto().getPrecio()) 
                                + "  ", 10, y);
                        y += yShift;
                        g2d.drawString("Nota: \n"+nota, 10, y);
                         
                        y += yShift;
                    }
                }
                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Total: " + pedido.getTotal() + "               ", 10, y);
                y += yShift;
                g2d.drawString("-------------------------------------", 10, y);
                y += yShift;
                g2d.drawString("      Tenemos envios a domicilio     ", 10, y);
                y += yShift;
                g2d.drawString("             23456788765             ", 10, y);
                y += yShift;
                g2d.drawString("*************************************", 10, y);
                y += yShift;
                g2d.drawString("         Gracias por visitarnos       ", 10, y);
                y += yShift;
                g2d.drawString("*************************************", 10, y);
                y += yShift;

            } catch (Exception r) {
                r.printStackTrace();
            }
            result = PAGE_EXISTS;
        }
        return result;
    }
}
