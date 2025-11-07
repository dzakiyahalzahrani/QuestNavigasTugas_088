package com.example.questnavigastugas_088.view


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_088.R // Pastikan ini sesuai dengan package dan lokasi file R Anda

// Home composable ini menerima lambda untuk navigasi
@Composable
fun Home(onNavigateToPendaftaran: () -> Unit) {
// Scaffold memberikan struktur dasar untuk layar, termasuk slot untuk TopBar, BottomBar, dll.
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFFE0F7FA)
    )