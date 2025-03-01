package com.h8h.solid_principles.isp.bad;

public class XeroxWorkCenter implements IMultiFunction {

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
        System.out.println("Faxing");
    }

    @Override
    public void internetFax() {
        System.out.println("Internet faxing");
    }

}
