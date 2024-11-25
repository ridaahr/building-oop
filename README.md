# Edificio

Crea un programa que permita gestionar un edificio

## Beans

### Edificio

Campos:
- Dirección
- Municipio
- Apartamentos

### Apartamento

Campos:
- Planta
- Puerta
- Propietarios

### Propietario

Campos:
- NIF
- Nombre
- Apellidos

## Componentes

### Readers

Haz un reader por cada bean

### BuildingApp

Debe tener un método run() que haga:
- Pide los datos del edificio
- Inicia un bucle de menú con las siguientes opciones:
    - Muestra toda la información del edificio 
    - Muestra los apartamentos de la primera planta 
    - Muestra los datos del apartamento situado en una puerta y planta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"
    - Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"
