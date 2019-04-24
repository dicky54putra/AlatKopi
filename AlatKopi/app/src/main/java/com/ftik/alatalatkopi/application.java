package com.ftik.alatalatkopi;

import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;


public class application extends Application {
    private static String server="", username="", nama="", role="", email="", judul[] = null;
    private static String hp="", pilihOrder="", keterangan="", status="";
    private static int id = 0, user_id=0;
    private static ArrayList<HashMap<String, String>> data;
    private static String tglBooking1, tglBooking2;
    private static ArrayList<String> wisata, alamat, latitude, longitude, file, telepon, alat, deskripsi, kategori;


    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static String getServer() {
        return server;
    }

    public static void setServer(String theserver)
    {
        application.server = theserver;
    }


    public static String getUsername() {
        return username;
    }

    public static void setUsername(String str) {
        application.username = str;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String str) {
        application.nama = str;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String str) {
        application.role = str;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String str) {
        application.email = str;
    }

    public static String[] getJudul() {
        return judul;
    }

    public static void setJudul(String[] str) {
        application.judul = str;
    }

    public static String getHP() {
        return hp;
    }

    public static void setHP(String str) {
        application.hp = str;
    }



    public static String getPilihOrder() {
        return pilihOrder;
    }

    public static void setPilihOrder(String str) {
        application.pilihOrder = str;
    }

    public static void setId(int str) {
        application.id = str;
    }

    public static int getId() {
        return id;
    }


    public static void setUserId(int str) {
        application.user_id = str;
    }

    public static int getUserId() {
        return user_id;
    }


    public static String getKeterangan() {
        return keterangan;
    }

    public static void setKeterangan(String str) {
        application.keterangan = str;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String str) {
        application.status = str;
    }

    public static ArrayList<HashMap<String, String>> getArray() {
        return data;
    }

    public static void setArray(ArrayList<HashMap<String, String>> str) {
        application.data = str;
    }

    public static String getTglBooking1() {
        return tglBooking1;
    }

    public static void setTglBooking1(String str) {
        application.tglBooking1 = str;
    }

    public static String getTglBooking2() {
        return tglBooking2;
    }

    public static void setTglBooking2(String str) {
        application.tglBooking2 = str;
    }

    public static ArrayList<String> getNamaLokasi() {
        return wisata;
    }

    public static void setNamaLokasi(ArrayList<String> str) {
        application.wisata = str;
    }

    public static ArrayList<String> getTelepon() {
        return telepon;
    }

    public static void setTelepon(ArrayList<String> str) {
        application.telepon = str;
    }

    public static ArrayList<String> getAlat() {
        return alat;
    }

    public static void setAlat(ArrayList<String> str) {
        application.alat = str;
    }

    public static ArrayList<String> getDeskripsi() {
        return deskripsi;
    }

    public static void setDeskripsi(ArrayList<String> str) {
        application.deskripsi = str;
    }

    public static ArrayList<String> getKategori() {
        return kategori;
    }

    public static void setKategori(ArrayList<String> str) {
        application.kategori = str;
    }

    public static ArrayList<String> getLongitude() {
        return longitude;
    }

    public static void setLongitude(ArrayList<String> str) {
        application.longitude = str;
    }

    public static ArrayList<String> getFile() {
        return file;
    }

    public static void setFile(ArrayList<String> str) {
        application.file = str;
    }
}


