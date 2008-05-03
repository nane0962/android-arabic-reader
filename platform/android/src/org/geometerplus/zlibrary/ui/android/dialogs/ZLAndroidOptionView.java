/*
 * Copyright (C) 2007-2008 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.zlibrary.ui.android.dialogs;

import android.view.View;

import org.geometerplus.zlibrary.core.dialogs.ZLOptionView;
import org.geometerplus.zlibrary.core.dialogs.ZLOptionEntry;

abstract class ZLAndroidOptionView extends ZLOptionView {
	ZLAndroidDialogContent myTab;
	private boolean myIsVisible;

	protected ZLAndroidOptionView(ZLAndroidDialogContent tab, String name, ZLOptionEntry option) {
		super(name, option);
		myTab = tab;
	}

	boolean isVisible() {
		return myIsVisible;
	}

	protected void show() {
		myIsVisible = true;
		myTab.invalidateView();
	}

	protected void hide() {
		myIsVisible = false;
		myTab.invalidateView();
	}

	protected void _setActive(boolean active) {
		// TODO: implement
	}

	abstract void addAndroidViews();
}