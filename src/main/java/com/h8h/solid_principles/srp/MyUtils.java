package com.h8h.solid_principles.srp;

import java.io.*;

public class MyUtils {
    public static String serializeIntoAString(Object obj) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(obj);
            return bos.toString("ISO-8859-1"); // Se podría usar Base64 para mejorar compatibilidad
        } catch (IOException e) {
            throw new RuntimeException("Error serializando objeto", e);
        }
    }
}

