package org.zoologico.entities.habitat;

public class HabitatNoFreeSpace extends Exception{
    HabitatNoFreeSpace(String message, Throwable th){
        super(message,th);
    }
}
