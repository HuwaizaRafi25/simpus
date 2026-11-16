package org.example.service

import org.example.model.Item

interface Pencarian {
    fun cariItem(keyword: String): List<Item>
}

