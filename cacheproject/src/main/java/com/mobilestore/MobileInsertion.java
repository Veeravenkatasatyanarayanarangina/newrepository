package com.mobilestore;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class MobileInsertion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Configuration configuration= new Configuration().configure("config.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session se = factory.openSession();
        Transaction tr = se.beginTransaction();
        MobileStore ms = new MobileStore();
        System.out.print("enter id :");
        ms.setMid(sc.nextInt());
        System.out.print("enter name  :");
        ms.setMname(sc.next());
        System.out.print("enter price : ");
        ms.setPrice(sc.nextDouble());
        System.out.print("enter ram  : ");
        ms.setRam(sc.nextInt());
        System.out.print("enter os :");
        ms.setOs(sc.next());
        se.persist(ms);
        tr.commit();
        se.close();
    }
}
