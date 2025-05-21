package com.codingninja.kzr.Intro.IntroDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    final DB db;

    DBService(DB db){
        this.db = db;
    }

    void getData(){
        db.getDB();
    }
}
