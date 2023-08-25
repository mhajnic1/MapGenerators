package MapGenerators;

public class trash {

	
	 /*public MapGeneratorGUI() {
    map = new char[mapHeight][mapWidth];
    generateMap();

    JPanel buttonPanel = new JPanel();
    

    JButton resetButton = new JButton("Reset");
    resetButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedFunction = (String) islandFunctionsComboBox.getSelectedItem();
            resetMap(selectedFunction);
        }
    });

    
    
    JComboBox<String> islandFunctionsComboBox = new JComboBox<>();
    islandFunctionsComboBox.addItem("Basic Generate Islands");
    islandFunctionsComboBox.addItem("Random Cluster Islands");
    islandFunctionsComboBox.addItem("Individual Island Clusters");
    islandFunctionsComboBox.setSelectedIndex(0);

    JButton generateButton = new JButton("Generate Islands");
    generateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedFunction = (String) islandFunctionsComboBox.getSelectedItem();
            generateMap(selectedFunction);
            repaint();
        }
    });

    buttonPanel.add(islandFunctionsComboBox);
    buttonPanel.add(generateButton);
    
    
    buttonPanel.add(resetButton);

    setLayout(new BorderLayout());
    add(buttonPanel, BorderLayout.SOUTH);
    add(new MapPanel(), BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack(); // Automatically sizes the window based on components
    setLocationRelativeTo(null);
    setVisible(true);
}
*/


/*
private void generateMap() {
	
	mapWidth = 100;    // Increase the map width (number of cells)
    mapHeight = 100;
    
    // Fill the entire map with water (~)
    for (int y = 0; y < mapHeight; y++) {
        for (int x = 0; x < mapWidth; x++) {
            map[y][x] = '~'; // Water
        }
    }

    int numIslands = rand.nextInt(20) + 10; // Increase the number of islands (between 10 and 29)

    for (int i = 0; i < numIslands; i++) {
        generateIsland();
    }

    addTrees();
} */
	
	 
	/*
	    private void generateMap() {
	        // Fill the entire map with water (~)
	        for (int y = 0; y < mapHeight; y++) {
	            for (int x = 0; x < mapWidth; x++) {
	                map[y][x] = '~'; // Water
	            }
	        }

	        int numIslands = rand.nextInt(10) + 5; // Random number of islands (between 5 and 14)

	        for (int i = 0; i < numIslands; i++) {
	            int startX = rand.nextInt(mapWidth);
	            int startY = rand.nextInt(mapHeight);

	            if (map[startY][startX] == '~') {
	                primGrowingTree(startX, startY);
	            }
	        }

	        addTrees();
	    }

	    /////////////////////////////////////////
	     private void generateMap() {
	    // Fill the entire map with water (~)
	    for (int y = 0; y < mapHeight; y++) {
	        for (int x = 0; x < mapWidth; x++) {
	            map[y][x] = '~'; // Water
	        }
	    }

	    int numIslands = rand.nextInt(10) + 5; // Random number of islands (between 5 and 14)

	    for (int i = 0; i < numIslands; i++) {
	        int clusterSize = rand.nextInt(30) + 20; // Random cluster size (between 20 and 49)
	        generateIslandCluster(clusterSize);
	    }

	    addTrees();
	}

	private void generateIslandCluster(int clusterSize) {
	    for (int i = 0; i < clusterSize; i++) {
	        int x = rand.nextInt(mapWidth);
	        int y = rand.nextInt(mapHeight);

	        if (map[y][x] == '~') {
	            map[y][x] = ' '; // Land
	        }
	    }
	}

	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     */////////////////////////////////////////////////////////
		//	Possible functions/algorithms for the islands
		/////////////////////////////////////////////////
	
	There are several island generation algorithms you can explore, each offering a unique way to generate islands. Here are a few additional ideas:

		Perlin Noise Generation: Use Perlin noise or other procedural noise functions to create realistic-looking islands with varying elevations. This can lead to more natural land formations.

		Voronoi Diagrams: Generate islands using Voronoi diagrams, where each cell represents an island. You can adjust cell sizes to control island sizes.

		Cellular Automata: Apply cellular automata to simulate island growth over multiple iterations. This can create interesting coastlines and terrain features.

		Diamond-Square Algorithm: Adapt the diamond-square algorithm, commonly used for terrain generation, to create islands with varying elevations and coastlines.

		Fractal Island Generation: Use fractal algorithms like the Diamond-Square or Midpoint Displacement to generate islands with intricate details and self-similarity.

		Blob Generation: Generate islands as random "blobs" by spreading points and connecting them, allowing for more organic island shapes.

		Biomes and Ecosystems: Create islands based on different biomes, generating different terrain, flora, and fauna for each.

		Road Map Style: Generate islands resembling road maps, with interconnected roads forming the landmasses.

		Particle Deposition: Simulate particles depositing material, creating islands based on their movement and deposition patterns.

		Recursive Growth: Start with a central landmass and recursively grow new land patches outward, creating a branching island structure.

		Remember that the choice of algorithm depends on the desired aesthetics and gameplay mechanics of your game. You can experiment with different algorithms to see which one fits best with the style of your pirate-themed game.
	     

	
	
	
	Certainly! Here are some more functions, algorithms, and techniques you can consider for generating islands with varied terrain and features:

		//Diamond-Square Algorithm: This is another popular algorithm for generating heightmaps. It involves recursively subdividing the map into smaller diamond and square shapes and adjusting their heights based on random perturbations. This creates smoother and more realistic terrains.

		//Voronoi Diagrams: Voronoi diagrams can be used to create irregularly shaped islands with distinct regions. Each cell of the Voronoi diagram represents a different region of the island, which can have its own biome, elevation, or features.

		Marching Squares: This algorithm can be used for creating coastlines. It generates a grid of squares and uses interpolation to create smooth curves along the edges of the landmass, resulting in more organic-looking coastlines.

		Hydraulic Erosion Simulation: Simulate erosion by using algorithms inspired by fluid dynamics. This can create realistic river networks, valleys, and erosion patterns on the island.

		Road and Path Networks: Generate road and path networks that connect different regions of the island. This can add a sense of civilization and connectivity to your generated world.

		Cave and Dungeon Generation: If you're interested in adding underground features, consider generating cave systems, dungeons, or underground tunnels using cellular automata or procedural methods.

		Volcano Generation: Create volcanic islands with central peaks and lava flows. Simulate the formation of volcanic terrain and ash layers.

		Climate and Biome Simulation: Implement a climate simulation that affects the distribution of biomes across the island. Different parts of the island can have different weather patterns, temperatures, and vegetation based on their location and elevation.

		Lakes and Rivers: Generate lakes and rivers that flow naturally from higher elevations to lower elevations. Incorporate river deltas and river networks that contribute to the overall geography of the island.

		Elevation-based Biomes: Instead of generating biomes solely based on noise, use elevation thresholds to determine the type of biome in a specific region. For example, low-lying areas could be swamps, mid-elevation areas could be forests, and high-elevation areas could be snowy peaks.

		Ecosystem Interactions: Create systems where the presence of certain biomes or features affects nearby regions. For example, forests could impact humidity and precipitation in neighboring areas.

		Archipelago Generation: If you're interested in creating multiple islands, you can use techniques like Voronoi diagrams to generate clusters of islands with varying sizes and shapes.

		Remember that combining multiple algorithms and techniques can lead to even more complex and interesting island generation. Experiment with different parameters and combinations to achieve the desired visual and gameplay effects in your game.

		
		
		
		1. Procedural Dungeon Generation: 
			   Create a system that generates random dungeons with different rooms, corridors, and traps. You could make a simple roguelike game that uses these generated dungeons as levels.

			2. Terrain Generation: 
			   Develop a terrain generation system for an open-world game. Use noise algorithms like Perlin or Simplex to create realistic landscapes with mountains, valleys, and rivers.

			3. Item/Weapon/Enemy Generation: 
			   Build a system that generates random items, weapons, or enemies for a role-playing game. These generated elements could have different stats, abilities, or behaviors.

			4. Quest Generation: 
			   Design a quest or mission generator for a game. Generate objectives, characters, locations, and rewards for players to complete.

			5. City/Building Generation: 
			   Create a random city or building generator. You could generate city layouts, roads, buildings, and even interiors.

			6. Space Exploration: 
			   Develop a space exploration game where players explore procedurally generated star systems, planets, and alien creatures.

			7. Maze Generation: 
			   Build a maze generator for a puzzle game. Generate intricate mazes with different paths and dead ends.

			8. Map Biomes and Ecosystems: 
			   Expand on your island generation project by adding ecosystems, biomes, and weather patterns that affect gameplay and visuals.

			9. Weather and Climate Simulation: 
			   Create a system that simulates weather and climate changes in an open-world game. Rain, snow, wind, and seasons could impact gameplay.

			10. Creature Behavior Simulation: 
			    Design a simulation of creature behavior in an ecosystem. Creatures could interact, hunt, mate, and evolve over time.

			11. City Traffic Simulation: 
			    Build a simulation of city traffic, including vehicles, pedestrians, traffic lights, and road conditions.

			12. Plant Growth and Ecology: 
			    Develop a simulation of plant growth, spreading, and competition in an ecosystem. Different plants could have varying effects on the environment.

			Remember that these projects can be as simple or complex as you want them to be. They offer great opportunities to learn about procedural generation, simulation, and game design. Choose one that aligns with your interests and skill level, and enjoy the journey of creating something unique!

}
