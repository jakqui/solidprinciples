package com.h8h.solid_principles.isp.good;

public class XeroxWorkCenter implements IPrint, IScan, IFax {

    @Override
    public void fax() {
        System.out.println("Faxing");
    }

    @Override
    public void internetFax() {
        System.out.println("Internet faxing");
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
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details");
    }    

}
