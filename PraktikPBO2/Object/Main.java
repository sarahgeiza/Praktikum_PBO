package Object;

public class Main {
    public static void main(String[] args) {

        // pembuatan 5 objek
        Printer printer = new Printer();
        Parfum parfum = new Parfum();
        Pulpen pulpen = new Pulpen();
        mesinCuci mesinCuci = new mesinCuci();
        riceCooker riceCooker = new riceCooker();

        System.out.println("PRINTER");
        printer.nyalakanPrinter();
        printer.tekanStart();
        printer.tekanStop();
        printer.matikanPrinter();

        System.out.println("\nPARFUM");
        parfum.bukaTutup();
        parfum.pencetParfum();

        System.out.println("\nPULPEN");
        pulpen.tekan();

        System.out.println("\nMESIN CUCI");
        mesinCuci.mulaiPencucian();
        mesinCuci.pilihModeCuci();
        mesinCuci.aturWaktuBilas();
        mesinCuci.keringkanPakaian();

        System.out.println("\nRICE COOKER");
        riceCooker.nyalakan();
        riceCooker.masak();
        riceCooker.pause();
    }
}