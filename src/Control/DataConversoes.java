/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author gusta
 */
public class DataConversoes
{

    public static String inverterData(String data)
    {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            Date date = formato.parse(data);
            return Integer.toString(date.getYear()) + '-' + Integer.toString(date.getMonth()) + '-' + Integer.toString(date.getDay());
        } catch (ParseException ex)
        {
           return "Erro ao converter data";
        }
    }
}
