/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.universalis.rest.routes.api;

import de.chojo.universalis.rest.requests.Request;
import de.chojo.universalis.rest.response.MarketBoardResponse;
import de.chojo.universalis.rest.routes.api.marketboard.RegionMarketBoardRequest;

import java.time.Duration;

public interface MarketBoardRequest extends Request<MarketBoardResponse>, RegionMarketBoardRequest {
    MarketBoardRequest listingsLimit(int limit);

    /**
     * The number of entries to return. By default, a maximum of 5 entries will be returned.
     *
     * @param limit limit
     * @return request
     */
    MarketBoardRequest historyLimit(int limit);

    /**
     * If the result should not have Gil sales tax (GST) factored in.
     * GST is applied to all consumer purchases in-game, and is separate from the retainer city tax that impacts what sellers receive.
     * By default, GST is factored in.
     *
     * @return request
     */
    MarketBoardRequest noGst();

    /**
     * If the result should not have Gil sales tax (GST) factored in.
     * GST is applied to all consumer purchases in-game, and is separate from the retainer city tax that impacts what sellers receive.
     * By default, GST is factored in.
     *
     * @param noGst set to true to disable GST
     * @return request
     */
    MarketBoardRequest noGst(boolean noGst);

    /**
     * Filter for HQ listings and entries. By default, both HQ and NQ listings and entries will be returned.
     *
     * @return request
     */
    default MarketBoardRequest highQuality() {
        return highQuality(true);
    }

    /**
     * Filter for NQ listings and entries. By default, both HQ and NQ listings and entries will be returned.
     *
     * @return request
     */
    default MarketBoardRequest normalQuality() {
        return highQuality(false);
    }

    /**
     * Filter for HQ listings and entries. By default, both HQ and NQ listings and entries will be returned.
     *
     * @param highQuality set to true to only receive hq listings
     * @return request
     */
    MarketBoardRequest highQuality(boolean highQuality);

    /**
     * The amount of time before now to take entries within the history data returned by {@link MarketBoardResponse#recentHistory()}.
     *
     * @param duration duration
     * @return request
     */
    MarketBoardRequest historyTime(Duration duration);

    /**
     * The amount of time before now to calculate stats over. By default, this is 7 days.
     * <p>
     * Affects {@link MarketBoardResponse#saleVelocity()}
     *
     * @param duration duration
     * @return request
     */
    MarketBoardRequest statsTime(Duration duration);
}