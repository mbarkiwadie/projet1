

class Testjunit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPrixTTC() {
		Article ar = new Article("wadie", "farah", 2019, 2021);
		assertEquals(520, ar.prixTTC());
	}

}
