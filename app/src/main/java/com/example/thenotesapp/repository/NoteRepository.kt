package com.example.thenotesapp.repository

import android.provider.ContactsContract
import com.example.thenotesapp.database.NoteDatabase

class NoteRepository(private val db: NoteDatabase) {
    suspend fun insertNote (note: ContactsContract.CommonDataKinds.Note) = db.getNoteDao().insertNote(note)

    suspend fun deleteNote (note: ContactsContract.CommonDataKinds.Note) = db.getNoteDao().deleteNote (note)

    suspend fun updateNote (note: ContactsContract.CommonDataKinds.Note) = db.getNoteDao().updateNote (note)

    fun getAllNotes()= db.getNoteDao().getAllNotes()

    fun searchNote (query: String?)= db.getNoteDao().searchNote (query)
}