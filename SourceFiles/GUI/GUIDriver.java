import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.LinkedHashMap;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GUIDriver {

	public static Boolean login = false;
	private User currentUser;
	private LinkedHashMap<String, User> userMap = new LinkedHashMap<String, User>();
	private LinkedHashMap<String, Events> eventsMap = new LinkedHashMap<String, Events>();
	static GUIDriver driver = new GUIDriver();

	// Current database

	// edited database

	// new instances

	public static void main(String args[]) throws IOException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {

		// Get data and turn into hashmap
		System.out.println("Hello");

		UIManager.setLookAndFeel(UIManager
				.getCrossPlatformLookAndFeelClassName());

		Landing landing = new Landing();
		landing.setLocationRelativeTo(null);
		landing.setVisible(true);

		Register register = new Register();
		register.setLocationRelativeTo(null);
		register.setVisible(false);

		Login login = new Login();
		login.setLocationRelativeTo(null);
		login.setVisible(false);

		CreateEvent creatEvent = new CreateEvent();
		creatEvent.setLocationRelativeTo(null);
		creatEvent.setVisible(false);

		UpdateUser updateUser = new UpdateUser();
		updateUser.setLocationRelativeTo(null);
		updateUser.setVisible(false);

		EventPage event = new EventPage();
		event.setLocationRelativeTo(null);
		event.setVisible(false);

		EditEvent editEvent = new EditEvent();
		editEvent.setLocationRelativeTo(null);
		editEvent.setVisible(false);

		AddUser addUser = new AddUser();
		addUser.setLocationRelativeTo(null);
		addUser.setVisible(false);

		// Test Data
		User antonUser = new User();
		antonUser.setfName("Anton");
		antonUser.setlName("Alexander");
		antonUser.setEmail("Dmvevents@gmail.com");
		antonUser.setPassword("anton");
		antonUser.setdOB("06/26/1985");
		antonUser.setUserID("001");

		Events antonEvent = new Events();
		antonEvent.setEventID("001");
		antonEvent.setName("BDay");
		antonEvent.setVenue("The House");
		antonEvent.setDate("06/26/1985");
		antonEvent.setInfo("Anton Birthday at the house");
		antonEvent.setStartDate("02:00");
		antonEvent.setEndDate("03:00");

		User jay = new User();
		jay.setfName("Jay");
		jay.setlName("Boring");
		jay.setEmail("jaypboring@gmail.com");
		jay.setPassword("jay");
		jay.setdOB("02/02/1978");
		jay.setUserID("002");

		Events jayEvent = new Events();
		jayEvent.setEventID("002");
		jayEvent.setName("Bday");
		jayEvent.setVenue("The crib");
		jayEvent.setDate("01/01/2000");
		jayEvent.setInfo("y2k armageddon");
		jayEvent.setStartDate("12:00");
		jayEvent.setEndDate("12:01");

		User ericUser = new User();
		ericUser.setfName("Eric");
		ericUser.setlName("Monk");
		ericUser.setEmail("eric.monk.mil@gmail.com");
		ericUser.setPassword("statistics");
		ericUser.setdOB("03/24/1987");
		ericUser.setUserID("003");

		Events ericEvent = new Events();
		ericEvent.setEventID("003");
		ericEvent.setName("Family Renion");
		ericEvent.setVenue("House");
		ericEvent.setDate("06/12/2015");
		ericEvent.setInfo("Family is coming to my house");
		ericEvent.setStartDate("09:00");
		ericEvent.setEndDate("12:00");

		/*
		 * Instance of drive class in main method
		 */

		// Sample User
		driver.getUserMap().put("Dmvevents@gmail.com", antonUser);
		driver.getUserMap().put("jaypboring@gmail.com", jay);
		driver.getUserMap().put("eric.monk.mil@gmail.com", ericUser);

		// Sample Event
		driver.getEventsMap().put("001", antonEvent);
		driver.getEventsMap().put("002", jayEvent);
		driver.getEventsMap().put("003", ericEvent);

		Homepage homepage = new Homepage(driver.getEventsMap());
		homepage.setLocationRelativeTo(null);
		homepage.setVisible(false);
		homepage.updateEvents(driver.getEventsMap());

		/*
		 * Landing functionality
		 */

		driver.landingFunctions(landing, register, login);

		/*
		 * Login Functionality
		 */

		driver.loginFuction(landing, login, homepage, driver);

		/*
		 * Register functionality
		 */

		driver.registerFunction(landing, register, driver);

		/*
		 * Homepage Functionality
		 */

		driver.homepageFunction(homepage, creatEvent, updateUser, event, driver);

		/*
		 * Update User
		 */

		driver.updateUserFunction(homepage, updateUser, driver);

		/*
		 * Create Event Functions
		 */

		driver.creatEventFunctions(creatEvent, addUser, driver, homepage);

		/*
		 * Events Page Functions
		 */

		event.getEditSettings().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				JOptionPane.showMessageDialog(null, "Edit Settings");
				event.setVisible(false);
				homepage.updateEvents(driver.getEventsMap());
				homepage.setVisible(true);

			}

		});

		event.getUpdateEvent().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				JOptionPane.showMessageDialog(null, "Update Event");
				event.setVisible(false);
				editEvent.setVisible(true);

			}

		});

		/*
		 * Edit Event Functionality
		 */

		editEvent.getCancel().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				JOptionPane.showMessageDialog(null, "Edit Cancelled");
				editEvent.setVisible(false);
				event.setVisible(true);

			}

		});

		editEvent.getEdit().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				if (editEvent.isInfoValid() == true) {

					// TODO method to validate event info and pass it to main
					// method

					// TODO geteventID

					Events newEvent = editEvent.getEventInfo("ID");
					String key = Integer
							.toString(driver.getEventsMap().size() + 1);

					driver.getEventsMap().put(key, newEvent);

					// Display success message
					JOptionPane.showMessageDialog(null, "Event Edited");

					// Go back to homepage
					editEvent.setVisible(false);
					event.setVisible(true);

				}
			}
		});

		editEvent.getAddUser().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				addUser.setVisible(true);
			}
		});

		/*
		 * Add user functionality
		 */

		addUser.getAddUser().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				if (addUser.isEmailValid() == true) {

					String userEmail = addUser.getEmail();
					if (driver.getUserMap().containsKey(userEmail)) {

						User userToAdd = driver.getUserMap().get(userEmail);

						// eventListHashMap

						JOptionPane.showMessageDialog(null, "User Added");

					} else {
						User userToAdd = new User();
						userToAdd.setEmail(userEmail);

						// TODO add to event attending list

						JOptionPane.showMessageDialog(null, "User Added");

					}
				} else {

					JOptionPane.showMessageDialog(null, "User Invalid");
				}

				addUser.setVisible(false);

			}

		});

		addUser.getCancel().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				JOptionPane.showMessageDialog(null, "Add Canceled");
				addUser.setVisible(false);
			}

		});
	}

	/*
	 * Method Functions
	 */

	public void creatEventFunctions(CreateEvent creatEvent, AddUser addUser,
			GUIDriver driver, Homepage homepage) {
		creatEvent.getCreate().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				if (creatEvent.isInfoValid() == true) {

					// TODO method to validate event info and pass it to main
					// method
					Events newEvent = creatEvent.getEventInfo();
					String key = Integer
							.toString(driver.getEventsMap().size() + 1);

					driver.getEventsMap().put(key, newEvent);

					// Display success message
					JOptionPane.showMessageDialog(null, "Event Created");

					// Go back to homepage
					creatEvent.setVisible(false);
					homepage.updateEvents(driver.getEventsMap());
					homepage.setVisible(true);

				}

			}

		});

		creatEvent.getAddUser().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				addUser.setVisible(true);

			}

		});

		creatEvent.getCancel().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				JOptionPane.showMessageDialog(null, "Create Cancelled");
				creatEvent.setVisible(false);
				homepage.updateEvents(driver.getEventsMap());
				homepage.setVisible(true);

			}

		});
	}

	public void updateUserFunction(Homepage homepage, UpdateUser updateUser,
			GUIDriver driver) {
		updateUser.getCancel().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Update Canceled");
				updateUser.setVisible(false);
				homepage.updateEvents(driver.getEventsMap());
				homepage.setVisible(true);

			}

		});

		updateUser.getEditUser().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Check if user information is valid
				 */

				updateUser.setVisible(false);
				homepage.updateEvents(driver.getEventsMap());
				homepage.setVisible(true);

				if (updateUser.isInfoValid() == true) {

					String updatedUserID = driver.getCurrentUser().getUserID();
					// TODO methods in updateUser to create user with same ID
					// based on new info
					User updatedUser = updateUser.getInfo(updatedUserID);

					// Replace User Information
					driver.getUserMap().replace(updatedUserID, updatedUser);
					driver.currentUser = updatedUser;

					JOptionPane.showMessageDialog(null, "User Updated");

				}
			}

		});
	}

	public void homepageFunction(Homepage homepage,

	CreateEvent creatEvent, UpdateUser updateUser, EventPage event,
			GUIDriver driver) {

		homepage.getCreateEvent().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				homepage.setVisible(false);
				creatEvent.setVisible(true);

			}

		});

		homepage.getEditSettings().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				homepage.setVisible(false);
				updateUser.setVisible(true);

			}

		});

		homepage.getUserEvents().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				if (e.getClickCount() == 2) {

					JTable target = (JTable) e.getSource();
					int row = target.getSelectedRow();
					// do some action if appropriate column

					String eventID = (String) target.getValueAt(row, 1);
					Events currentEvent = driver.getEventsMap().get(eventID);

					System.out.println("Here");
					// TODO create method to update frame information
					event.updateFrame(currentEvent);
					homepage.setVisible(false);
					event.setVisible(true);

					// Display event
				}
			}
		});
	}

	public void registerFunction(Landing landing, Register register,
			GUIDriver driver) {
		register.getRegister().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Get new user instance and it to the data base to be add to
				 * sql server when the program is closed
				 */

				// TODO create functions to get email and create new user
				// instance
				if (register.isInfoValid() == true) {

					String newUserKey = register.getEmailKey();
					User newUser = register.getUser();

					if (driver.getUserMap().containsKey(newUserKey)) {

						// print this user exist
						JOptionPane.showMessageDialog(null, "This User Exist");

					} else {

						driver.getUserMap().put(newUserKey, newUser);
						JOptionPane.showMessageDialog(null, "User Created");

						register.setVisible(false);
						landing.setVisible(true);
					}
				}
			}
		});

		register.getCancel().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Register Canceled");
				register.setVisible(false);
				landing.setVisible(true);
			}
		});
	}

	public void loginFuction(Landing landing, Login login, Homepage homepage,
			GUIDriver driver) {
		login.getLogin().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				/*
				 * Method to check if the user is in the database if true it
				 * advances to the homepage
				 * 
				 * if false then it prints a error
				 */

				// TODO
				String userEmail = login.getUserEmail();
				String userPassWord = login.getUserPassword();

				if (login.getEmailValid() == true) {

					if (driver.getUserMap().containsKey(userEmail) == true) {

						// TODO check password

						driver.setCurrentUser(driver.getUserMap()
								.get(userEmail));

						if (driver.getCurrentUser().getPassword()
								.equals(userPassWord)) {
							// Display homepage
							login.setVisible(false);
							homepage.setVisible(true);
						}
					} else {

						JOptionPane.showMessageDialog(null,
								"User Does Not Exist");

					}
				}
			}

		});

		login.getCancel().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Login Canceled");
				login.setVisible(false);
				landing.setVisible(true);

			}

		});
	}

	public void landingFunctions(Landing landing, Register register, Login login) {

		landing.getLogin().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				landing.setVisible(false);
				login.setVisible(true);

			}

		});

		landing.getRegister().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				landing.setVisible(false);
				register.setVisible(true);
			}

		});
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public LinkedHashMap<String, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(LinkedHashMap<String, User> userMap) {
		this.userMap = userMap;
	}

	public LinkedHashMap<String, Events> getEventsMap() {
		return eventsMap;
	}

	public void setEventsMap(LinkedHashMap<String, Events> eventsMap) {
		this.eventsMap = eventsMap;
	}
}
