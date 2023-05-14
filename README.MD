# Gaia Procedural Gen: Stellar System Generator

## Description

The Gaia Procedural Gen is a tool that generates simple stellar systems based on fictitious data derived from Gaia Sky. It is designed to be used as a generator for a future mobile simulator project. The generated systems are not based on real astronomical data but provide a realistic representation of stellar systems for simulation purposes.

## Usage

To use the Gaia Procedural Gen, follow these steps:

1. Clone the repository or download the source code.
2. Install the required dependencies (listed in the requirements.txt file) if necessary.
3. Run the ProceduralSystemGenerator class, either from an IDE or through the command line.
4. Adjust the parameters in the code to customize the generated stellar systems. You can specify the number of star systems to generate and the maximum number of planets per system.
5. Execute the program and wait for the generation process to complete.
6. Once the generation is finished, the program will display the generated stellar systems with their respective stars and planets.
7. Optionally, you can modify the code to save the generated systems in a desired format or perform additional operations on the data.

Please note that this program requires the Gaia Sky data release 3 to be available in order to generate the stellar systems accurately.

## Example Output

Here is an example of the program's output:
    
```
StarSystem{
    name='Gaia EDR3 4295806720', 
    star=Star [
        name=Gaia EDR3 4295806720, 
        ra=44.99615537864534, 
        dec=0.005615226341865997, 
        parsecs=2.8222234098459342, 
        y/l=9.200448316097745, 
        parallax=0.3543305595550248, 
        l=176.94278852482034, 
        b=-48.88493355232444, 
        photGMeanMag=17.641426, 
        dr2RadialVelocity=0.0, 
        bpRp=2.4582462
    ], 
    planets=[
        Planet{
            name='Gaia_EDR3_4295806720_P1', 
            mass=43.789968203788455, 
            radius=0.5531894288443084, 
            distanceFromStar=942.4260209055288, 
            orbitalPeriod=139.35807606897365
        }, 
        Planet{
            name='Gaia_EDR3_4295806720_P2', 
            mass=44.00430664051548, 
            radius=1.2126172505262423, 
            distanceFromStar=750.563551937235, 
            orbitalPeriod=148.77054739766848
        }, 
        Planet{
            name='Gaia_EDR3_4295806720_P3', 
            mass=5.32178537491077, 
            radius=0.2763491633488757, 
            distanceFromStar=603.9132737513733, 
            orbitalPeriod=332.8736757452051
        }, 
        Planet{
            name='Gaia_EDR3_4295806720_P4', 
            mass=83.95210219828637, 
            radius=2.924333671909778, 
            distanceFromStar=22.963417939551476, 
            orbitalPeriod=747.2069251243662
        }
    ]
}
```

Star and planet objects are displayed in JSON format, with the following properties:

1. Star:
   - designation: The name or identifier of the star.
   - ra: Right ascension, which represents the star's position on the celestial sphere.
   - dec: Declination, which represents the star's position on the celestial sphere.
   - parallax: The parallax measurement of the star, providing information about its distance.
   - l: Galactic longitude, indicating the star's position in the galaxy.
   - b: Galactic latitude, indicating the star's position in the galaxy.
   - photGMeanMag: The mean magnitude of the star in the G-band, providing information about its brightness.
   - dr2RadialVelocity: Radial velocity, indicating the star's motion towards or away from us.
   - bpRp: Color index representing the difference in magnitude between the Bp and Rp bands, which can provide information about the star's temperature and color.

2. Planet:
   - Name: The name of the planet.
   - mass: The mass of the planet, in earth masses.
   - radius: The radius of the planet, in earth radii.
   - distanceFromStar: The distance between the planet and its host star, in AU.
   - orbitalPeriod: The orbital period of the planet, in days.
            

## Roadmap:

1. Import catalog from CSV file:
   - Develop functionality to import data from a CSV file containing information about stars and planets.
   - Implement a parser to read and process the CSV file and convert it into usable objects in the program.
   - Validate the imported data and handle possible errors or inconsistencies in the file format.

2. Improve designation of names for planets:
   - Implement logic to generate more descriptive and meaningful names for the generated planets.
   - Use algorithms or patterns to assign names based on features such as the host star, the order of the planets, or specific characteristics of each planet.

3. Incorporate different stellar objects into the systems:
   - Expand the generation of stellar systems to include different types of objects, such as binary stars, neutron stars, black holes, among others.
   - Develop the rules and algorithms necessary to generate systems that contain these objects, considering their properties and gravitational relationships.

4. Create MySQL database and use it as a data source:
   - Configure a MySQL database to store and manage the data of the generated stellar systems.
   - Implement integration with the database in the program, allowing reading and writing of data from and to the database.
   - Use SQL queries to perform operations such as searching, filtering, and updating data in the database.

5. Generate a menu for interacting with the database and selecting generation options:
   - Develop a user-friendly menu system that allows users to interact with the Gaia Procedural Gen and select various options for generating stellar systems.
   - Implement menu functionality to display available actions, such as importing catalog data, generating systems, querying existing systems, and managing database settings.
   - Incorporate user input validation to ensure that valid options are selected and handle errors or invalid inputs gracefully.
   - Enable the ability to customize generation parameters through the menu, such as specifying the number of star systems, maximum number of planets, or other relevant parameters.
   - Provide feedback and status updates during the generation process, allowing users to monitor progress and receive notifications upon completion.

By adding this interactive menu system, users will have a more intuitive and flexible way to control the Gaia Procedural Gen, allowing them to choose specific options and generate stellar systems according to their preferences. This will also allow users to manage the database and perform operations such as searching and filtering systems, as well as updating or deleting existing systems.


## Contributing
Contributions to the Gaia Procedural Gen project are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request on the GitHub repository.

## License
The Gaia Procedural Gen is open-source software licensed under the MIT license. Feel free to use, modify, and distribute this code for personal or commercial purposes.

## Acknowledgements
The Gaia Procedural Gen relies on the Gaia Sky data release 3, made available by the European Space Agency (ESA). We would like to express our gratitude to the Gaia mission and the ESA for providing the data that makes this project possible.

https://www.cosmos.esa.int/web/gaia/data-release-3
http://cdn.gea.esac.esa.int/Gaia/gedr3/gaia_source/

## Contact

If you have any questions or comments, please contact me at:

k3ssdev@proton.me

## Authors

* **Alberto Pérez** - [k3ssdev](k3ssdev@proton.me)