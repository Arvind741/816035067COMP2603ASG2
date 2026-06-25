import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Swing GUI for searching and viewing animals in a sanctuary.
 *
 * Layout:
 *   NORTH:  Search field, type combo box, injured checkbox, search button
 *   CENTER: Scrollable text area showing results
 *   SOUTH:  Status label showing match count
 */
public class SanctuaryGUI extends JFrame {
    // TODO M10: Declare private Sanctuary field
    private Sanctuary sanctuary;

    // TODO M9: Declare GUI components:
    //   JTextField nameField
    private JTextField nameField;

    //   JComboBox<String> typeCombo
    private JComboBox<String> typeCombo;

    //   JCheckBox injuredCheck
    private JCheckBox injuredCheck;

    //   JButton searchButton
    private JButton searchButton;

    //   JTextArea resultArea
    private JTextArea resultArea;

    //   JLabel statusLabel
    private JLabel statusLabel;

    public SanctuaryGUI() {
        super("Caribbean Wildlife Conservation Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);

        // TODO M9: Set layout to BorderLayout
        setLayout(new BorderLayout());

        // TODO M9: Build NORTH panel (FlowLayout)
        //   Add JLabel "Search:", JTextField (14 columns), JLabel "Type:",
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());

        northPanel.add(new JLabel("Search:"));

        nameField = new JTextField(14);
        northPanel.add(nameField);
        northPanel.add(new JLabel("Type:"));

        //   JComboBox with {"All","Bird","Reptile","Marine"},
        typeCombo = new JComboBox<String>(new String[]{"All", "Bird", "Reptile", "Marine"});
        northPanel.add(typeCombo);

        //   JCheckBox "Injured/Critical only", JButton "Search"
        injuredCheck = new JCheckBox("Injured/Critical only");
        northPanel.add(injuredCheck);

        searchButton = new JButton("Search");
        northPanel.add(searchButton);
        add(northPanel, BorderLayout.NORTH);

        //   Add panel to NORTH

        // TODO M9: Build CENTER
        //   Create JTextArea, set monospaced font, make non-editable
        //   Wrap in JScrollPane, add to CENTER
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scroll = new JScrollPane(resultArea);
        add(scroll, BorderLayout.CENTER);

        // TODO M9: Build SOUTH
        //   Create JLabel "Ready", add to SOUTH
        statusLabel = new JLabel("Ready");
        add(statusLabel, BorderLayout.SOUTH);

        // TODO M11: Add ActionListener to searchButton that calls runSearch()
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        runSearch();
                    }
                });

        // TODO M11: Add KeyListener to nameField that calls runSearch() on keyReleased
        nameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                runSearch();
            }
        });

        setLocationRelativeTo(null);
    }

    /**
     * Stores the Sanctuary to search over.
     * TODO M10: Implement setModel
     */
    public void setModel(Sanctuary s) {
        // TODO M10: Store the sanctuary reference
        // TODO M10: Optionally update the window title
        this.sanctuary = s;

        if (s != null) {
            setTitle("Caribbean Wildlife Conservation Tracker - " + s.getName());
        }
    }

    /**
     * Filters the sanctuary's animals based on the GUI controls and
     * displays matching results.
     *
     * TODO M11: Implement runSearch
     *
     * Steps:
     * 1. Get text from nameField (trim, convert to lowercase)
     * 2. Get selected type from typeCombo
     * 3. Get checkbox state from injuredCheck
     * 4. Loop through sanctuary's animals:
     *    - If text is non-empty, keep only animals whose species or nickname
     *      contains the text (case-insensitive)
     *    - If type is not "All", keep only matching type
     *    - If checkbox is selected, keep only "Injured" or "Critical" animals
     * 5. Build result string and set in resultArea
     * 6. Set statusLabel: "No matches", "1 result", or "N results"
     */
    private void runSearch() {
        // TODO M11: Implement filtering and display
            String searchText = nameField.getText().trim().toLowerCase();

            String selectedType = (String) typeCombo.getSelectedItem();

            boolean injured = injuredCheck.isSelected();

            String results = "";
            int count = 0;

            for (Animal a : sanctuary.getAnimals()) {

                boolean matches = true;

                // Search text filter
                if (!searchText.isEmpty()) {

                    boolean speciesMatch =
                            a.getSpecies().toLowerCase().contains(searchText);

                    boolean nicknameMatch =
                            a.getNickname().toLowerCase().contains(searchText);

                    if (!speciesMatch && !nicknameMatch) {
                        matches = false;
                    }
                }

                // Type filter
                if (!selectedType.equals("All")) {
                    if (!a.getType().equals(selectedType)) {
                        matches = false;
                    }
                }

                // Injured/Critical filter
                if (injured) {
                    String health = a.getHealthStatus();

                    if (!health.equals("Injured") &&
                            !health.equals("Critical")) {

                        matches = false;
                    }
                }

                // Add matching animal
                if (matches) {
                    results += a.toString() + "\n";
                    count++;
                }
            }

            resultArea.setText(results);

            if (count == 0) {
                statusLabel.setText("No matches");
            }
            else if (count == 1) {
                statusLabel.setText("1 result");
            }
            else {
                statusLabel.setText(count + " results");
            }
        }
    }

    /**
     * Creates a demo sanctuary, populates it, and launches the GUI.
     *
     * TODO M12: Implement main method
     */
    public static void main(String[] args) {
        // TODO M12: Create Sanctuary, add animals, create GUI, wire model, show
        Sanctuary caroni= new Sanctuary("Caroni Bird Sanctuary", "Trinidad", 20);

        //   Bird: "Scarlet Ibis", "Ruby", Trinidad, 0.35, "Healthy", 60.0, true
        Bird ruby= new Bird("Scarlet Ibis", "Ruby", "Trinidad", 0.35, "Healthy", 60.0, true);
        caroni.addAnimal(ruby);

        //   Bird: "Scarlet Ibis", "Blaze", Trinidad, 0.40, "Healthy", 58.0, true
        Bird blaze= new Bird("Scarlet Ibis", "Blaze", "Trinidad", 0.40, "Healthy", 58.0, true);
        caroni.addAnimal(blaze);

        //   Bird: "Cocrico", "Dusty", Trinidad, 0.25, "Injured", 30.0, true
        Bird dusty= new Bird("Cocrico", "Dusty", "Trinidad", 0.25, "Injured", 30.0, true);
        caroni.addAnimal(dusty);

        //   Reptile: "Spectacled Caiman", "Brutus", Trinidad, 45.0, "Healthy", false, 180.0
        Reptile brutus= new Reptile("Spectacled Caiman", "Brutus", "Trinidad", 45.0, "Healthy",false, 180.0);
        caroni.addAnimal(brutus);

        //   Reptile: "Green Anaconda", "Medusa", Trinidad, 30.0, "Critical", false, 350.0
        Reptile medusa= new Reptile("Green Anaconda", "Medusa", "Trinidad", 30.0, "Critical",false, 350.0);
        caroni.addAnimal(medusa);

        //   Marine: "Leatherback Turtle", "Atlas", Trinidad, 500.0, "Healthy", 1200.0, 8000
        Marine atlas= new Marine("Leatherback Turtle", "Atlas", "Trinidad", 500.0, "Healthy", 1200.0, 8000);
        caroni.addAnimal(atlas);

        SanctuaryGUI gui = new SanctuaryGUI();
        gui.setModel(caroni);

        gui.setVisible(true);



    }

