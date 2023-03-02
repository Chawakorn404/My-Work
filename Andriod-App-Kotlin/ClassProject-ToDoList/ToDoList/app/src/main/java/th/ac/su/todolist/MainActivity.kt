package th.ac.su.todolist

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*

class MainActivity : AppCompatActivity() {

    var itemList:ArrayList<String> = ArrayList()
    lateinit var arrayAdapter:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemList.add("watch the batman")
        itemList.add("play Elden Ring")
        itemList.add("sussy baka")

        var list = findViewById<ListView>(R.id.list)

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,itemList)
        list.adapter = arrayAdapter

        registerForContextMenu(list)

        list.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,itemList[i], Toast.LENGTH_SHORT).show()
        }

        var edt = findViewById<EditText>(R.id.edt)
        var btnAdd =  findViewById<Button>(R.id.btnAdd)

        btnAdd.setOnClickListener{

            var todo = edt.text.toString()

            if(todo.length>0){
                itemList.add(0,todo)
            }

//            itemList.add(0,edt.text.toString())
            Toast.makeText(this,"add "+edt.text.toString(), Toast.LENGTH_SHORT).show()

            arrayAdapter.notifyDataSetChanged()

            hideKeyboard()
        }
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_clear ->{
                itemList.clear()
                arrayAdapter.notifyDataSetChanged()
            }
            R.id.action_remove_top ->{
                itemList.removeAt(0)
                arrayAdapter.notifyDataSetChanged()
            }
            R.id.share ->{

            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main_context,menu)

        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        val position = info.position

        when(item.itemId){
            R.id.action_remove ->{
                itemList.removeAt(position)

                arrayAdapter.notifyDataSetChanged()
            }
            R.id.action_edit -> {


            }
        }


        return super.onContextItemSelected(item)
    }

    fun Activity.hideKeyboard() {
        hideKeyboard(currentFocus ?: View(this))
    }

    fun Context.hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}