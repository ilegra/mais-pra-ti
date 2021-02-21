#include <iostream>
#include <clocale>
#include <cstdlib>
#include <ctime>
#include <stdio.h>
#include <time.h>
#include <string.h>
#include <conio.h>
#include <math.h>
#include <iomanip>
//cout << fixed;
//cout.precision(2);
using namespace std;
int main()
{
    setlocale(LC_ALL,"Portuguese");
    srand(time(NULL));
    int dias=0;
    long double forca=1,aux=0,aux2=0;
    long double dist_vis=0;
    cout << "Cáculo da força do Super-Homem" << endl;

    cout << "Insira a quantidade de dias que ele está na terra: " << endl;
    cin >> dias;
    if(dias<=365)
    {
        cout << "Não adquiriu força devido a adaptação!" << endl;
        cout << "Força: " << forca << " Humano(s) e a distância que sua visão de calor atinge (cm) " << dist_vis << endl;
    }
    else
    {
        dias = dias - 365;
        for(int i = 0; i<dias; i++)
        {
            aux = forca*0.03;
            forca=forca+aux;
        }
        if(forca>=10)
        {
            dist_vis = 10;
            for(int j = 0; j<dias; j++)
            {
                aux2 = dist_vis*0.02;
                dist_vis=dist_vis+aux2;

            }
        }
        cout << fixed;
        cout.precision(4);
        cout << "Força: " << forca << " Humano(s)" << endl;
        cout.precision(2);
        cout<<  "Distância que sua visão de calor atinge: " << dist_vis << " cm"<< endl;
    }
}

