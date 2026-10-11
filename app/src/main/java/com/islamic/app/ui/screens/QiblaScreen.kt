package com.islamic.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.islamic.app.ui.theme.PrimaryGreen
import com.islamic.app.ui.theme.SecondaryGold
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.PI

@Composable
fun QiblaScreen(navController: NavController) {
    var rotation by remember { mutableStateOf(0f) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAFAFA))
    ) {
        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(PrimaryGreen)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.White
                )
            }
            Text(
                text = "قبلے کی سمت",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.weight(1f)
            )
        }
        
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Information Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "کراچی، پاکستان",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreen
                    )
                    Text(
                        text = "Latitude: 24.8607° N",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "Longitude: 67.0011° E",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Compass
            Card(
                modifier = Modifier
                    .size(280.dp),
                shape = CircleShape,
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    // Compass Circle
                    Surface(
                        modifier = Modifier
                            .size(260.dp),
                        shape = CircleShape,
                        color = Color(0xFFF5F5F5)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            // North
                            Text(
                                text = "N",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red,
                                modifier = Modifier
                                    .align(Alignment.TopCenter)
                                    .padding(top = 20.dp)
                            )
                            // Qibla Direction Indicator
                            Text(
                                text = "→",
                                fontSize = 48.sp,
                                color = SecondaryGold,
                                modifier = Modifier.align(Alignment.Center)
                            )
                            // Qibla Text
                            Text(
                                text = "قبلہ",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreen,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(bottom = 20.dp)
                            )
                        }
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Direction Text
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "قبلہ کی سمت",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreen
                    )
                    Text(
                        text = "شمال مغرب کی طرف",
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Northwest - 312°",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}