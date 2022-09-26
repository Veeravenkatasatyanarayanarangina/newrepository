package com.mobilestore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class retriverecords
{
    public static void main(String[] args) {
        Configuration configuration= new Configuration().configure("config.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session se = factory.openSession();
        MobileStore ms1 = (MobileStore) se.load(MobileStore.class,103);
        System.out.println(ms1.getMid()+" "+ms1.getPrice()+" "+ms1.getMname()+" "+ms1.getRam()+" "+ms1.getOs());
        MobileStore ms = (MobileStore) se.load(MobileStore.class,103);
        System.out.println(ms.getMid()+" "+ms.getPrice()+" "+ms.getMname()+" "+ms.getRam()+" "+ms.getOs());
        se.close();


        System.out.println("==============================================");


        Session se2 = factory.openSession();
        ms1 = (MobileStore) se2.load(MobileStore.class,103);
        System.out.println(ms1.getMid()+" "+ms1.getPrice()+" "+ms1.getMname()+" "+ms1.getRam()+" "+ms1.getOs());
        se2.close();

    }
}
