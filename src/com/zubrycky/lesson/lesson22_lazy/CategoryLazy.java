package com.zubrycky.lesson.lesson22_lazy;

import java.util.ArrayList;
import java.util.List;

public class CategoryLazy {
    private List<Auction> auctions;

    public CategoryLazy() {
    }

    public List<Auction> getAuctions() {
        if (auctions==null){
            auctions=new ArrayList<>();
            auctions.add(new Auction("samocochód"));
            auctions.add(new Auction("rower"));
            auctions.add(new Auction("okno"));
        }
        return auctions;
    }

    @Override
    public String toString() {
        return "CategoryLazy{" +
                "auctions=" + auctions +
                '}';
    }
}
