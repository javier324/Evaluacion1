package Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.evaluacion1.R;
import static com.example.evaluacion1.MainActivity.corr;

import java.util.List;
import Entidad.Estudiante;

public class Adaptador extends BaseAdapter {

    private List<Estudiante> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;


    public List<Estudiante> GetData(){ return this.datasource;}
    /**
    *@param context
     * @param IdPlantilla
     * @param sources
     */

    public Adaptador(Context context, int IdPlantilla, List<Estudiante> sources){
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }

    @Override
    public int getCount(){return this.datasource.size();}

    @Override
    public Estudiante getItem(int position){ return  this.datasource.get(position);}

    @Override
    public long getItemId(int position){ return position;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(this.IdLayoutPlantilla, null);

            TextView labelNombre = convertView.findViewById(R.id.txtnombre);
            TextView labelCodigo = convertView.findViewById(R.id.txtcodigo);
            TextView labelCorrelativo = convertView.findViewById(R.id.txtcorrelativo);
            TextView labelMateria = convertView.findViewById(R.id.txtmateria);
            TextView labelPromedio = convertView.findViewById(R.id.txtpromedio);

                String correlativo = Integer.toString(position+1);
                labelCorrelativo.setText(correlativo);
                labelNombre.setText(this.datasource.get(position).GetNombre());
                labelCodigo.setText(this.datasource.get(position).GetCodigo());
                String lblpromedi = new Double(this.datasource.get(position).GetPromedio()).toString();
                labelPromedio.setText(lblpromedi);
                labelMateria.setText(this.datasource.get(position).GetMateria());

        }
        return convertView;
    }
}
