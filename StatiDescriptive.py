# -*- coding: utf-8 -*-
"""
Created on Fri Oct 10 11:30:48 2025

@author: Bilale SAVADOGO
"""

#On definit la liste qui ici s'appelle:"serie". 
serie = [] 
#On vous demande le nombre de notes 
nb_notes = int(input("Entrer le nombre de notes:")) 
for i in range (nb_notes): 
#Pour le nombres de notes que vous avez ,on vous demandera x notes 
    serie.append(float(input("Entrer la note :"))) 
#On trie la liste 
    serie.sort() 
#Calcul de la mediane 
if nb_notes % 2 != 0 : 
    med= serie[((nb_notes + 1) // 2) - 1] 
else : 
    med= (serie[(nb_notes // 2) - 1] + serie[nb_notes // 2]) / 2 
#Calcul de la moyenne 
total=sum(serie) 
m=total/nb_notes 
#Calcul de l'etendue 
e= max(serie) - min(serie) 
#Calcul du premier quartile 
if nb_notes%4==0: 
    q1=(serie[(nb_notes//4)- 1]) 
if nb_notes%4==1: 
    q1=(serie[(nb_notes+3)//4-1]) 
if nb_notes%4==2: 
    q1=(serie[(nb_notes+2)//4-1]) 
if nb_notes%4==3: 
    q1=(serie[(nb_notes+1)//4-1]) 
#Calcul du troisieme quartile 
if nb_notes%4==0: 
    q3=serie[(nb_notes*3//4)-1] 
if nb_notes%4==1: 
    q3=serie[((nb_notes+3)*3//4-2)-1] 
if nb_notes%4==2: 
    q3=serie[(nb_notes+2)*3//4-2] 
if nb_notes%4==3: 
    q3=serie[(nb_notes+1)*3//4-1] 
#Calcul de l'ecart inter-quartiles 
eq=q3-q1 
#Affichage des resultats. 
print ("La moyenne est de",m)
print( "La mediane est de",med )
print( "L'etendue est de",e)
print ("Le premier quartile est",q1)
print ("Le troisieme quartile est",q3) 
print ("L'ecart interquartile est",eq)
