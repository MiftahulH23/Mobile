package com.example.belajarkalkulator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.belajarkalkulator.databinding.ActivityLayoutCalculatorBinding

class KalkulatorBalok : AppCompatActivity() {
    private lateinit var binding: ActivityLayoutCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayoutCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHapus.setOnClickListener{
            binding.edtPanjang.setText("")
            binding.edtLebar.setText("")
            binding.edtTinggi.setText("")
            binding.txHasil.setText("")
        }
        binding.btnHitung.setOnClickListener{
            val panjang = Integer.valueOf(binding.edtPanjang.getText().toString())
            val lebar = Integer.valueOf(binding.edtLebar.getText().toString())
            val tinggi = Integer.valueOf(binding.edtTinggi.getText().toString())
            val luas = 2 * (panjang * lebar * tinggi)
            val keliling = 4 * (panjang*lebar *tinggi)
            val volume = panjang * lebar * tinggi
            val textOuput = "Hasil perhitungan \n\nLuas = $luas cm" +
                    "\nKeliling = $keliling cm \nVolume = $volume cm"
            binding.txHasil.setText(textOuput)
            binding.txHasil.setTextColor(getColor(R.color.colorAccent))

        }
    }

}