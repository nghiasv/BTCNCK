package com.example.btcnck;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Tạo danh sách dữ liệu
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("San pham 1", "Description 1", R.drawable.ic_delete));
        itemList.add(new Item("San pham 2", "Description 2", R.drawable.ic_delete));
        itemList.add(new Item("San pham 3", "Description 3", R.drawable.ic_delete));
        itemList.add(new Item("San pham 4", "Description 4", R.drawable.ic_delete));
        itemList.add(new Item("San pham 5", "Description 5", R.drawable.ic_delete));
        itemList.add(new Item("San pham 6", "Description 6", R.drawable.ic_delete));
        itemList.add(new Item("San pham 7", "Description 7", R.drawable.ic_delete));
        itemList.add(new Item("San pham 8", "Description 8", R.drawable.ic_delete));
        itemList.add(new Item("San pham 9", "Description 9", R.drawable.ic_delete));
        // Thêm dữ liệu khác

        // Cấu hình RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(itemList));
    }
}