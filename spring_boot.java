//CRIAÇÃO DO PROJETO-------------------

"https://start.spring.io/"  

//Dependências 
"spring-boot-starter-web"
"spring-boot-starter-data-jpa"
"spring-boot-devtools" //scope: "runtime" 
"spring-boot-starter-validation"

//CONTROLLER---------------------------

@RestController
@RequestMapping("/")
public class NomeDoController{
	
	@Autowired
	private NomeDoRepository nomeDoRepository;

	//métodos GET, POST, PUT, PATCH e/ou DELETE
	
}

//MÉTODOS DO CONTROLLER----------------

@GetMapping("/{id}")
public ResponseEntity<ClasseResponse> consultar(@PathVariable Long id) {
	//...
}


@PostMapping
@Transactional
public ResponseEntity<ClasseResponse> cadastrar(@RequestBody ClasseDTO classeDTO, UriComponentsBuilder uriBuilder) {
	//...
}


@PutMapping
@Transactional
public ResponseEntity<ClasseResponse> atualizar(@RequestBody ClasseDTO classeDTO) {
	//...
}


@DeleteMapping("/{id}")
@Transactional
public ResponseEntity<Void> remover(@PathVariable Long id) {
	//...
}

//RESPONSE ENTITY----------------------

//200
return ResponseEntity.ok(response);

//201
URI uri = uriBuilder.path("/musicas/{id}").buildAndExpand(musica.getId()).toUri();
return ResponseEntity.created(uri).body(new MusicaDetalhadaDto(musica));

//404
return ResponseEntity.notFound().build();

//ENTITY JPA---------------------------

@Entity
public class NomeTabela {
	//...
}

//atributos
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Enumerated(EnumType.STRING)
private NomeEnum nomeEnum;

@OneToMany(mappedby = "classe") //se incluir "cascade = CascadeType.REMOVE" permite a exclusão dos registros relacionados
private List<Classe> classeRelacionada;

// MÉTODOS DA INTERFACE REPOSITORY-----

nomeRepository.findAll();

nomeRepository.findById(id);

nomeRepository.save(entity);

nomeRepository.deleteById(id);

//consulta personalizada (seguindo o padrão)
List<Entidade> findByClasse(String valorDaClasse);

//consulta usando JPQL
@Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
User findUserByStatusAndNameNamedParams(@Param("status") Integer status, @Param("name") String name);

//BEAN VALIDATION----------------------

public class ClasseDTO {
	@NotNull @NotEmpty @Length(min = 5)
	private String atributo;
}

//Adicionar @Valid no método do controller
public ResponseEntity<ClasseResponse> atualizar(@RequestBody @Valid ClasseDTO classeDTO) {
	//...
}

//CONTROLLER ADVICE------------------------------

@RestControllerAdvice
public class ErroDeValidacaoHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErroDeFormularioDto> handle(MethodArgumentNotValidException exception) {
		List<ErroDeFormularioDto> dto = new ArrayList<>();
		List<FieldError> fieldErros = exception.getBindingResult().getFieldErrors();
		fieldErros.forEach(e -> {
			String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
			ErroDeFormularioDto erroDto = new ErroDeFormularioDto(e.getField(), mensagem);
			dto.add(erroDto);
		});
		
		return dto;
	}

}