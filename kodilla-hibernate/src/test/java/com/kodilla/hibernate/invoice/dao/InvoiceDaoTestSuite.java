package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
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
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("001/2018");
        invoice.getItems().add(new Item(new BigDecimal(100.99), 5, new BigDecimal(59.99)));
        invoice.getItems().add(new Item(new BigDecimal(22.49), 2, new BigDecimal(79.29)));
        invoice.getItems().add(new Item(new BigDecimal(40.99), 11, new BigDecimal(9.99)));

        //When
        invoiceDao.save(invoice);

        //Then
        int createdInvoiceId = invoice.getId();
        Assert.assertNotEquals(0, createdInvoiceId);

        //CleanUp
        invoiceDao.delete(invoice);
    }
}
