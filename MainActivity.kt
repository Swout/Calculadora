package com.example.calcu20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumbersEvent(view:View){
        if(isNewOp){
            ShowNumbers.setText("")
        }
        isNewOp=false
            val buselect= view as Button
            var buClickvalue:String=ShowNumbers.text.toString()
            when(buselect.id){
                bo0.id->{
                    buClickvalue+="0"
                }
                bu1.id->{
                    buClickvalue+="1"
                }
                bu2.id->{
                    buClickvalue+="2"
                }
                bo3.id->{
                    buClickvalue+="3"
                }
                bu4.id->{
                    buClickvalue+="4"
                }
                bu5.id->{
                    buClickvalue+="5"
                }
                bu6.id->{
                    buClickvalue+="6"
                }
                bu7.id->{
                    buClickvalue+="7"
                }
                bu8.id->{
                    buClickvalue+="8"
                }
                bu9.id->{
                    buClickvalue+="9"
                }
                bopunto.id->{
                    // prevenir agragar mas de un punto
                    buClickvalue+="."
                }
         //       buMore.id->{
                //    buClickvalue= "+$buClickvalue"
               // }
               // buMenor.id->{
               //     buClickvalue="-" + buClickvalue
             //   }

           }
        ShowNumbers.setText(buClickvalue)
    }
    var op="*"
    var oldNumber=""
    var isNewOp=true
    fun buOpEvent(view: View){
        val buSelect=view as Button
        when(buSelect.id){
            suma.id->{
                op="+"
            }
            resta.id->{
                op="-"
            }
            Multiplicacion.id->{
                op="*"
            }
            Division.id->{
                op="/"
            }
            bopor.id->{
                op="%"
            }
            cuadrado.id->{
                op="^2"
            }

        }
        oldNumber=ShowNumbers.text.toString()
        isNewOp=true
    }
    fun buEqEvent(view: View ){
        val newNumber=ShowNumbers.text.toString()
        var finalNumber:Double?=null
        val number:Double=ShowNumbers.text.toString().toDouble()/100
        when(op){
            "*"->{
                finalNumber= oldNumber.toDouble() *newNumber.toDouble()
            }
            "+"->{
                finalNumber= oldNumber.toDouble() +newNumber.toDouble()
            }
            "/"->{
                finalNumber= oldNumber.toDouble() /newNumber.toDouble()
            }
            "*-"->{
                finalNumber= oldNumber.toDouble() -newNumber.toDouble()
            }
            "^2"->{
                finalNumber= oldNumber.toDouble() *oldNumber.toDouble()
            }
        }
        ShowNumbers.setText(finalNumber.toString())
        isNewOp=true
    }
    fun pocentaje(view: View){
            val number:Double=ShowNumbers.text.toString().toDouble()/100

            ShowNumbers.setText(number.toString())
    }
    fun buclean(view: View){
        ShowNumbers.setText("0")
        isNewOp=true
    }
}