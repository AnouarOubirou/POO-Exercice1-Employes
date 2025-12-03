# TP4 POO - Exercice 1 : Gestion des Employés

Ce projet implémente un système de gestion du personnel avec différents types d’employés :

| Classe | Rôle |
|-------|------|
| Employe (abstraite) | Base des employés |
| Vendeur | Salaire basé sur le chiffre d’affaire |
| Représentant | Variante du vendeur avec prime plus élevée |
| Technicien | Salaire = nb unités × 5 |
| Manutentionnaire | Salaire = nb heures × 60 |
| ARisque | Interface ajoutant une prime fixe de 2000DH |
| TechnicienARisque / ManutentionnaireARisque | Employés exposés au danger |

## 💡 Fonctionnalités
✔ Calcul des salaires  
✔ Gestion employés à risques  
✔ Tri par salaire  
✔ Moyenne des salaires  

## ▶ Exécution
```bash
javac *.java
java TestEntreprise
