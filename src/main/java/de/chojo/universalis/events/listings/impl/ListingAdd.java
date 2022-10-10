/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.universalis.events.listings.impl;

import de.chojo.universalis.entities.Listing;
import de.chojo.universalis.entities.shared.Item;
import de.chojo.universalis.entities.shared.World;
import de.chojo.universalis.events.listings.BaseListing;

import java.util.List;

/**
 * Contains all reported listings.
 * <p>
 * These will be all reported listings even if these were reported before.
 * <p>
 * Eventually a {@link ListingRemove} event will be called beforehand removing all current listings.
 */
public class ListingAdd extends BaseListing {
    public ListingAdd(Item item, World world, List<Listing> listings) {
        super(item, world, listings);
    }
}