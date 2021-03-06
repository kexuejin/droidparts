package org.droidparts.sample.db;

import org.droidparts.persist.sql.EntityManager;
import org.droidparts.sample.model.Entry;

import android.content.Context;

public class EntryManager extends EntityManager<Entry> {

	public EntryManager(Context ctx) {
		super(Entry.class, ctx);
	}

	@Override
	public boolean create(Entry item) {
		item.created = System.currentTimeMillis();
		return super.create(item);
	}

}
