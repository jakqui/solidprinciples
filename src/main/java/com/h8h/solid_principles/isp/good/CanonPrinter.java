package com.h8h.solid_principles.isp.good;

public class CanonPrinter implements IPrint{

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Getting print spool details");
    }
    
}
