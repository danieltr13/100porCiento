/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impresion;

import dominio.DetallePedido;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ImprimirReporte implements Printable {

    private List<DetallePedido> detalleP;

    public ImprimirReporte(List<DetallePedido> detalleP) {
        this.detalleP = detalleP;
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

                g2d.setFont(new Font("Monospaced", Font.PLAIN, 10));
                g2d.drawString("****************************************************************************************", 10, y);
                y += yShift;
                g2d.drawString("                                        100 por ciento                                  ", 10, y);
                y += yShift;
                g2d.drawString("****************************************************************************************", 10, y);
                y += headerRectHeight;

                g2d.drawString("----------------------------------------------------------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(String.format("%-20s", "Nombre")
                        + String.format("%20s", "Categoria")
                        + String.format("%20s", "Cantidad")
                        + String.format("%20s", "Total"), 10, y);
                y += yShift;
                g2d.drawString("----------------------------------------------------------------------------------------", 10, y);
                y += headerRectHeight;
                y += yShift;
                for (DetallePedido detallePedido : detalleP) {
                    g2d.drawString(String.format("%-20s", detallePedido.getProducto().getNombre())
                            + String.format("%60s", detallePedido.getProducto().getCategoria()
                                    + String.format("%20s", detallePedido.getCantidad())
                                    + String.format("%20s", detallePedido.getTotal())), 10, y);
                    y += yShift;
                }
                g2d.drawString("----------------------------------------------------------------------------------------", 10, y);
                y += yShift;
                g2d.drawString(" Total: " + getTotal(detalleP) + "               ", 10, y);
                y += yShift;
                g2d.drawString("----------------------------------------------------------------------------------------", 10, y);
                y += yShift;
                g2d.drawString("                                  Reporte de venta de productos                  ", 10, y);
                y += yShift;
                g2d.drawString("                                           23456788765                                   ", 10, y);
                y += yShift;
                g2d.drawString("****************************************************************************************", 10, y);
                y += yShift;
                g2d.drawString("                                         100 por ciento                                  ", 10, y);
                y += yShift;
                g2d.drawString("****************************************************************************************", 10, y);
                y += yShift;

            } catch (Exception r) {
                r.printStackTrace();
            }
            result = PAGE_EXISTS;
        }
        return result;
    }

    private Float getTotal(List<DetallePedido> detallesPedidos) {
        Float total = 0.0f;
        for (DetallePedido detallesPedido : detallesPedidos) {
            total += detallesPedido.getTotal();
        }
        return total;
    }
}
