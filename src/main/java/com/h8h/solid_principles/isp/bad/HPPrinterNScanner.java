package com.h8h.solid_principles.isp.bad;

public class HPPrinterNScanner implements IMultiFunction {

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details");
    }

    @Override
    public void scan() {
        System.out.println("Scanning");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Scanning a photo");
    }

    @Override
    public void fax() {
        // METODO NO IMPLEMENTADO
    }

    @Override
    public void internetFax() {
        // METODO NO IMPLEMENTADO
    }
    
}
