package com.zubrycky.lesson.lesson22_lazy;

import java.util.ArrayList;
import java.util.List;

public class CategoryEager {
    private List<Auction> auctions;

    public CategoryEager() {
        auctions = new ArrayList<>();
        auctions.add(new Auction("samocochód"));
        auctions.add(new Auction("rower"));
        auctions.add(new Auction("okno"));
    }

    public List<Auction> getAuctions() {
        return auctions;
    }

    @Override
    public String toString() {
        return "CategoryEager{" +
                "auctions=" + auctions +
                '}';
    }
}
