package com.dicoding.diaadriansyah.mynotesapp.db

import android.net.Uri
import android.provider.BaseColumns

object DatabaseContract {
    // Authority yang digunakan
    const val AUTHORITY = "com.dicoding.diaadriansyah.mynotesapp"
    const val SCHEME = "content"
    /*
   Penggunaan Base Columns akan memudahkan dalam penggunaan suatu table
   Untuk id yang autoincrement sudah default ada di dalam kelas BaseColumns dengan nama field _ID
    */
    internal class NoteColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "note"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"
            // Base content yang digunakan untuk akses content provider
            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
                    .authority(AUTHORITY)
                    .appendPath(TABLE_NAME)
                    .build()
        }
    }
}