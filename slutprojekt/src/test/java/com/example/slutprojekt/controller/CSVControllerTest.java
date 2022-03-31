package com.example.slutprojekt.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;
import com.example.HttpHelper;

public class CSVControllerTest {

    public String BASEURL = "http://localhost:8080/";

    @Test
    public void testReadCSV() throws IOException {
        

        String subDomain = "readCSV/";
        
        CSVController csvc = new CSVController();
        
        String query = BASEURL + subDomain;
		String actual = HttpHelper.UrlResponse(query, "get", null);
        
        String expected = "{\"Orders\": [{\"OrderDate\" : \"1/6/2019\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Sharell\",\"Item\" : \"Pencil\",\"Units\" : \"95\",\"UnitCost\" : \"1.99\",\"Total\" : \"189.05\"},{\"OrderDate\" : \"1/23/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Kivell\",\"Rep2\" : \"Francisca\",\"Item\" : \"Binder\",\"Units\" : \"50\",\"UnitCost\" : \"19.99\",\"Total\" : \"999.5\"},{\"OrderDate\" : \"2/9/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Jardine\",\"Rep2\" : \"Gregg\",\"Item\" : \"Pencil\",\"Units\" : \"36\",\"UnitCost\" : \"4.99\",\"Total\" : \"179.64\"},{\"OrderDate\" : \"2/26/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Gill\",\"Rep2\" : \"Wendie\",\"Item\" : \"Pen\",\"Units\" : \"27\",\"UnitCost\" : \"19.99\",\"Total\" : \"539.73\"},{\"OrderDate\" : \"3/15/2019\",\"Region\" : \"West\",\"Rep1\" : \"Sorvino\",\"Rep2\" : \"Miles\",\"Item\" : \"Pencil\",\"Units\" : \"56\",\"UnitCost\" : \"2.99\",\"Total\" : \"167.44\"},{\"OrderDate\" : \"4/1/2019\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Jeana\",\"Item\" : \"Binder\",\"Units\" : \"60\",\"UnitCost\" : \"4.99\",\"Total\" : \"299.4\"},{\"OrderDate\" : \"4/18/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Andrews\",\"Rep2\" : \"Daine\",\"Item\" : \"Pencil\",\"Units\" : \"75\",\"UnitCost\" : \"1.99\",\"Total\" : \"149.25\"},{\"OrderDate\" : \"5/5/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Jardine\",\"Rep2\" : \"Arnita\",\"Item\" : \"Pencil\",\"Units\" : \"90\",\"UnitCost\" : \"4.99\",\"Total\" : \"449.1\"},{\"OrderDate\" : \"5/22/2019\",\"Region\" : \"West\",\"Rep1\" : \"Thompson\",\"Rep2\" : \"Lorine\",\"Item\" : \"Pencil\",\"Units\" : \"32\",\"UnitCost\" : \"1.99\",\"Total\" : \"63.68\"},{\"OrderDate\" : \"6/8/2019\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Vivan\",\"Item\" : \"Binder\",\"Units\" : \"60\",\"UnitCost\" : \"8.99\",\"Total\" : \"539.4\"},{\"OrderDate\" : \"6/25/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Morgan\",\"Rep2\" : \"Ernest\",\"Item\" : \"Pencil\",\"Units\" : \"90\",\"UnitCost\" : \"4.99\",\"Total\" : \"449.1\"},{\"OrderDate\" : \"7/12/2019\",\"Region\" : \"East\",\"Rep1\" : \"Howard\",\"Rep2\" : \"Flo\",\"Item\" : \"Binder\",\"Units\" : \"29\",\"UnitCost\" : \"1.99\",\"Total\" : \"57.71\"},{\"OrderDate\" : \"7/29/2019\",\"Region\" : \"East\",\"Rep1\" : \"Parent\",\"Rep2\" : \"Lilli\",\"Item\" : \"Binder\",\"Units\" : \"81\",\"UnitCost\" : \"19.99\",\"Total\" : \"1619.19\"},{\"OrderDate\" : \"8/15/2019\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Kristyn\",\"Item\" : \"Pencil\",\"Units\" : \"35\",\"UnitCost\" : \"4.99\",\"Total\" : \"174.65\"},{\"OrderDate\" : \"9/1/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Smith\",\"Rep2\" : \"Tashina\",\"Item\" : \"Desk\",\"Units\" : \"2\",\"UnitCost\" : \"125\",\"Total\" : \"250\"},{\"OrderDate\" : \"9/18/2019\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Maryann\",\"Item\" : \"Pen Set\",\"Units\" : \"16\",\"UnitCost\" : \"15.99\",\"Total\" : \"255.84\"},{\"OrderDate\" : \"10/5/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Morgan\",\"Rep2\" : \"Nicolas\",\"Item\" : \"Binder\",\"Units\" : \"28\",\"UnitCost\" : \"8.99\",\"Total\" : \"251.72\"},{\"OrderDate\" : \"10/22/2019\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Donn\",\"Item\" : \"Pen\",\"Units\" : \"64\",\"UnitCost\" : \"8.99\",\"Total\" : \"575.36\"},{\"OrderDate\" : \"11/8/2019\",\"Region\" : \"East\",\"Rep1\" : \"Parent\",\"Rep2\" : \"Arlie\",\"Item\" : \"Pen\",\"Units\" : \"15\",\"UnitCost\" : \"19.99\",\"Total\" : \"299.85\"},{\"OrderDate\" : \"11/25/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Kivell\",\"Rep2\" : \"Jade\",\"Item\" : \"Pen Set\",\"Units\" : \"96\",\"UnitCost\" : \"4.99\",\"Total\" : \"479.04\"},{\"OrderDate\" : \"12/12/2019\",\"Region\" : \"Central\",\"Rep1\" : \"Smith\",\"Rep2\" : \"Jenifer\",\"Item\" : \"Pencil\",\"Units\" : \"67\",\"UnitCost\" : \"1.29\",\"Total\" : \"86.43\"},{\"OrderDate\" : \"12/29/2019\",\"Region\" : \"East\",\"Rep1\" : \"Parent\",\"Rep2\" : \"Meghan\",\"Item\" : \"Pen Set\",\"Units\" : \"74\",\"UnitCost\" : \"15.99\",\"Total\" : \"1183.26\"},{\"OrderDate\" : \"1/15/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Gill\",\"Rep2\" : \"Margert\",\"Item\" : \"Binder\",\"Units\" : \"46\",\"UnitCost\" : \"8.99\",\"Total\" : \"413.54\"},{\"OrderDate\" : \"2/1/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Smith\",\"Rep2\" : \"Danuta\",\"Item\" : \"Binder\",\"Units\" : \"87\",\"UnitCost\" : \"15\",\"Total\" : \"1305\"},{\"OrderDate\" : \"2/18/2020\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Lilliam\",\"Item\" : \"Binder\",\"Units\" : \"4\",\"UnitCost\" : \"4.99\",\"Total\" : \"19.96\"},{\"OrderDate\" : \"3/7/2020\",\"Region\" : \"West\",\"Rep1\" : \"Sorvino\",\"Rep2\" : \"Judi\",\"Item\" : \"Binder\",\"Units\" : \"7\",\"UnitCost\" : \"19.99\",\"Total\" : \"139.93\"},{\"OrderDate\" : \"3/24/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Jardine\",\"Rep2\" : \"Kimiko\",\"Item\" : \"Pen Set\",\"Units\" : \"50\",\"UnitCost\" : \"4.99\",\"Total\" : \"249.5\"},{\"OrderDate\" : \"4/10/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Andrews\",\"Rep2\" : \"Alpha\",\"Item\" : \"Pencil\",\"Units\" : \"66\",\"UnitCost\" : \"1.99\",\"Total\" : \"131.34\"},{\"OrderDate\" : \"4/27/2020\",\"Region\" : \"East\",\"Rep1\" : \"Howard\",\"Rep2\" : \"Aaron\",\"Item\" : \"Pen\",\"Units\" : \"96\",\"UnitCost\" : \"4.99\",\"Total\" : \"479.04\"},{\"OrderDate\" : \"5/14/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Gill\",\"Rep2\" : \"Ronnie\",\"Item\" : \"Pencil\",\"Units\" : \"53\",\"UnitCost\" : \"1.29\",\"Total\" : \"68.37\"},{\"OrderDate\" : \"5/31/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Gill\",\"Rep2\" : \"Janean\",\"Item\" : \"Binder\",\"Units\" : \"80\",\"UnitCost\" : \"8.99\",\"Total\" : \"713.2\"},{\"OrderDate\" : \"6/17/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Kivell\",\"Rep2\" : \"Maxwell\",\"Item\" : \"Desk\",\"Units\" : \"5\",\"UnitCost\" : \"125\",\"Total\" : \"625\"},{\"OrderDate\" : \"7/4/2020\",\"Region\" : \"East\",\"Rep1\" : \"Jones\",\"Rep2\" : \"Joaquin\",\"Item\" : \"Pen Set\",\"Units\" : \"62\",\"UnitCost\" : \"4.99\",\"Total\" : \"309.38\"},{\"OrderDate\" : \"7/21/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Morgan\",\"Rep2\" : \"Britni\",\"Item\" : \"Pen Set\",\"Units\" : \"55\",\"UnitCost\" : \"12.49\",\"Total\" : \"686.95\"},{\"OrderDate\" : \"8/7/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Kivell\",\"Rep2\" : \"Katheleen\",\"Item\" : \"Pen Set\",\"Units\" : \"42\",\"UnitCost\" : \"23.95\",\"Total\" : \"1005.9\"},{\"OrderDate\" : \"8/24/2020\",\"Region\" : \"West\",\"Rep1\" : \"Sorvino\",\"Rep2\" : \"Franklin\",\"Item\" : \"Desk\",\"Units\" : \"3\",\"UnitCost\" : \"275\",\"Total\" : \"825\"},{\"OrderDate\" : \"9/10/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Gill\",\"Rep2\" : \"Norine\",\"Item\" : \"Pencil\",\"Units\" : \"7\",\"UnitCost\" : \"1.29\",\"Total\" : \"9.03\"},{\"OrderDate\" : \"9/27/2020\",\"Region\" : \"West\",\"Rep1\" : \"Sorvino\",\"Rep2\" : \"Mario\",\"Item\" : \"Pen\",\"Units\" : \"76\",\"UnitCost\" : \"1.99\",\"Total\" : \"151.24\"},{\"OrderDate\" : \"10/14/2020\",\"Region\" : \"West\",\"Rep1\" : \"Thompson\",\"Rep2\" : \"Morgan\",\"Item\" : \"Binder\",\"Units\" : \"57\",\"UnitCost\" : \"19.99\",\"Total\" : \"1139.43\"},{\"OrderDate\" : \"10/31/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Andrews\",\"Rep2\" : \"Kivell\",\"Item\" : \"Pencil\",\"Units\" : \"14\",\"UnitCost\" : \"1.29\",\"Total\" : \"18.06\"},{\"OrderDate\" : \"11/17/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Jardine\",\"Rep2\" : \"Brianna\",\"Item\" : \"Binder\",\"Units\" : \"11\",\"UnitCost\" : \"4.99\",\"Total\" : \"54.89\"},{\"OrderDate\" : \"12/4/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Jardine\",\"Rep2\" : \"Margert\",\"Item\" : \"Binder\",\"Units\" : \"94\",\"UnitCost\" : \"19.99\",\"Total\" : \"1879.06\"},{\"OrderDate\" : \"12/21/2020\",\"Region\" : \"Central\",\"Rep1\" : \"Andrews\",\"Rep2\" : \"Danuta\",\"Item\" : \"Binder\",\"Units\" : \"28\",\"UnitCost\" : \"4.99\",\"Total\" : \"3234\"}]}";
        assertEquals(expected, actual);

    }

    
}
