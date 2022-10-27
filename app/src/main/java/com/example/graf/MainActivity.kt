package com.example.graf

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var showAnswer = findViewById<Button>(R.id.showAnswer)
        var vertex = findViewById<EditText>(R.id.vertex)
        var edge = findViewById<EditText>(R.id.edge)
        var answer = findViewById<EditText>(R.id.answer)

        class Graph{
            fun addEdge(adj: ArrayList<ArrayList<Int?>>, u: Int, v: Int) {
                adj[u].add(v)
                adj[v].add(u)
            }
            fun printGraph(adj: ArrayList<ArrayList<Int>>) {
                for (i in 0 until adj.size) {
                    println(
                        "\nAdjacency list of vertex"
                                + i
                    )
                    print("head")
                    for (j in 0 until adj[i].size) {
                        System.out.print(
                            (" -> "
                                    + adj[i][j])
                        )
                    }
                    println()

                }
            }
        }

        showAnswer.setOnClickListener {

        }
    }
}