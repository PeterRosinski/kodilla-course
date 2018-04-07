package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String INVOICENUMBER = "001/01/2018";

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Item item1 = new Item(new BigDecimal(5.0),20);
        Item item2 = new Item(new BigDecimal(5.1), 50);
        Item item3 = new Item(new BigDecimal(18), 1);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        Invoice invoice = new Invoice(INVOICENUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0,invoiceId);

        //CleanUp
        invoiceDao.delete(invoiceId);
    }
}
