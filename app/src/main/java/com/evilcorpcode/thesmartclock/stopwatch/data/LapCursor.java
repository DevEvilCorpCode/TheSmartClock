/*
 * Copyright 2018 EvilCorpCode & original author Phillip Hsu
 *
 * This file is part of TheSmartClock.
 *
 * TheSmartClock is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TheSmartClock is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TheSmartClock.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.evilcorpcode.thesmartclock.stopwatch.data;

import android.database.Cursor;

import com.evilcorpcode.thesmartclock.data.BaseItemCursor;
import com.evilcorpcode.thesmartclock.stopwatch.Lap;

/**
 * Created by Phillip Hsu on 8/8/2016.
 */
public class LapCursor extends BaseItemCursor<Lap> {

    public LapCursor(Cursor cursor) {
        super(cursor);
    }

    @Override
    public Lap getItem() {
        Lap lap = new Lap();
        lap.setId(getLong(getColumnIndexOrThrow(LapsTable.COLUMN_ID)));
        lap.setT1(getLong(getColumnIndexOrThrow(LapsTable.COLUMN_T1)));
        lap.setT2(getLong(getColumnIndexOrThrow(LapsTable.COLUMN_T2)));
        lap.setPauseTime(getLong(getColumnIndexOrThrow(LapsTable.COLUMN_PAUSE_TIME)));
        lap.setTotalTimeText(getString(getColumnIndexOrThrow(LapsTable.COLUMN_TOTAL_TIME_TEXT)));
        return lap;
    }
}
