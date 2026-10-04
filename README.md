# Assignment 3 - Bridge Pattern

## Topic
Fencing Competition System

## Bridge Structure
- Abstraction: `FencingCompetition`
- Refined Abstractions: `CadetCompetition`, `JuniorCompetition`
- Implementor: `CompetitionFormat`
- Concrete Implementors: `PoolFormat`, `DirectEliminationFormat`

## Description
The project demonstrates the Bridge Pattern by separating competition categories from competition formats.

The competition format can be changed at runtime without changing the competition class.

## Clean Code Principles
1. Meaningful class names.
2. Separation of responsibilities.
3. Small and focused classes.
4. No duplicated logic.
5. Easy to extend with new competition formats.
