package ru.teamrocket.csrsysteamdesktop.Service;

import ru.teamrocket.csrsysteamdesktop.Model.Offer;

import java.util.List;

/**
 * Created by Kate on 13.11.2016.
 */
public interface OfferService {
    void writeFile(List<Offer> offerList);
    String readFile();
}