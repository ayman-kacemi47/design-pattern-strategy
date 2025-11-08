# 🎯 Strategy Pattern --- Mini Activité Pédagogique

Ce projet est un petit exercice pratique permettant de comprendre et
manipuler le **Pattern Strategy** en Java.\
L'objectif est de montrer comment un objet peut changer de comportement
**dynamiquement**, sans modifier son code interne.

## ✅ Objectifs pédagogiques

-   Comprendre le rôle du **contexte** (`Context`)
-   Implémenter différentes **stratégies** (`StrategyImpl1`,
    `StrategyImpl2`, `StrategyImpl3`)
-   Changer la stratégie **à l'exécution** via saisie utilisateur
-   Appréhender les avantages du pattern face à des `if/else` ou
    `switch` répétitifs

## 📌 Structure du projet

    src/main/java/
    │
    ├── Context.java
    ├── Strategy.java
    ├── DefaultStrategyImpl.java
    ├── StrategyImpl1.java
    ├── StrategyImpl2.java
    ├── StrategyImpl3.java
    └── Main.java

## 🧠 Explication du Pattern Strategy

Le **Strategy Pattern** permet d'encapsuler plusieurs algorithmes dans
des classes séparées et de changer l'algorithme utilisé **au runtime**.

✅ On évite les **gros switch/if**\
✅ On respecte **Open/Closed Principle**\
✅ Le **contexte** utilise une stratégie sans connaître son
implémentation concrète

## 🖼️ Diagramme UML du projet
<img width="1408" height="454" alt="UML Diagram" src="https://github.com/user-attachments/assets/9d2141b7-50e3-4216-830d-5db91d08684e" />

## 📦 Détails des classes

### 🔹 Interface `Strategy`

``` java
public interface Strategy {
    void perform();
}
```

### 🔹 Stratégies concrètes

``` java
public class StrategyImpl1 implements Strategy {
    @Override
    public void perform() {
        System.out.println("Strategy 1");
    }
}
```

### 🔹 Stratégie par défaut

``` java
public class DefaultStrategyImpl implements Strategy {
    @Override
    public void perform() {
        System.out.println("Default Strategy");
    }
}
```

### 🔹 Contexte

``` java
public class Context {
    private Strategy strategy = new DefaultStrategyImpl();

    public void applyStrategy() {
        System.out.println("=========================");
        strategy.perform();
        System.out.println("=========================
");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
```

## 🖥️ Programme principal

    Enter strategy:
    StrategyImpl1
    =========================
    Strategy 1
    =========================

