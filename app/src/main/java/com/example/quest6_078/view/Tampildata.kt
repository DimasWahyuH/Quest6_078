package com.example.navigationquest.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quest6_078.R
import com.example.quest6_078.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    statusUISiswa: Siswa,
    onBackBtnClick: () -> Unit
) {

    val items = listOf(
        Pair(stringResource(R.string.nama), statusUISiswa.nama),
        Pair(stringResource(R.string.gender), statusUISiswa.gender),
        Pair(stringResource(R.string.alamat), statusUISiswa.alamat)
    )
