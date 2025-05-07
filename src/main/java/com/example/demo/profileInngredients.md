## Working with config

Let's build a recipe app that can be run in two modes. For this we'll have two profiles: veg and nonveg

Create a commandline runner for the recipe app.
Display at the beginning the mode that we're running the app in (nonveg or veg).

Create two application properties for each. Give them two properties: dish.name en dish.ingredients

Create a DishService that has a name and a String ingredients. Work with values to assign the values from the config to them.
Give DishService a printDish method, display the name and ingredient list.

Use the commandlinerunner to trigger the printDish method.