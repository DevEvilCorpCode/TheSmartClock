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

package com.evilcorpcode.thesmartclock.timers.data;

import android.content.Context;

import com.evilcorpcode.thesmartclock.data.SQLiteCursorLoader;
import com.evilcorpcode.thesmartclock.timers.Timer;

/**
 * Created by Phillip Hsu on 7/29/2016.
 */
public class TimersListCursorLoader extends SQLiteCursorLoader<Timer, TimerCursor> {
    public static final String ACTION_CHANGE_CONTENT
            = "com.evilcorpcode.thesmartclock.timers.data.action.CHANGE_CONTENT";

    public TimersListCursorLoader(Context context) {
        super(context);
    }

    @Override
    protected TimerCursor loadCursor() {
        return new TimersTableManager(getContext()).queryItems();
    }

    @Override
    protected String getOnContentChangeAction() {
        return ACTION_CHANGE_CONTENT;
    }
}
