package com.h8h.solid_principles.isp.good;

public class HPPrinterNScanner implements IScan, IPrint {

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

}
