DELETE FROM Taco_Order_Tacos;
DELETE FROM Taco_Ingredients;
DELETE FROM Taco;
DELETE FROM Taco_Order;
DELETE FROM Ingredient;

INSERT INTO Ingredient (id, name, type) VALUES ('FLTO', 'pszenna', 'WRAP');
INSERT INTO Ingredient (id, name, type) VALUES ('COTO', 'kukurydziana', 'WRAP');
INSERT INTO Ingredient (id, name, type) VALUES ('GRBF', 'mielona wołowina', 'PROTEIN');
INSERT INTO Ingredient (id, name, type) VALUES ('CARN', 'kawałki mięsa', 'PROTEIN');
INSERT INTO Ingredient (id, name, type) VALUES ('TMTO', 'pomidory pokrojone w kostkę', 'VEGGIES');
INSERT INTO Ingredient (id, name, type) VALUES ('LETC', 'sałata', 'VEGGIES');
INSERT INTO Ingredient (id, name, type) VALUES ('CHED', 'cheddar', 'CHEESE');
INSERT INTO Ingredient (id, name, type) VALUES ('JACK', 'Monterey Jack', 'CHEESE');
INSERT INTO Ingredient (id, name, type) VALUES ('SLSA', 'pikantny sos pomidorowy', 'SAUCE');
INSERT INTO Ingredient (id, name, type) VALUES ('SRCR', 'śmietana', 'SAUCE');