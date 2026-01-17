using UnityEngine;

public class Player : MonoBehaviour
{
    public static Player Instance { get; set; }
    [SerializeField] private GameInput gameInput;
    private float moveSpeed = 5f;

    private void Awake()
    {
        Instance = this;
    }
    void Start()
    {
        
    }

    void Update()
    {
        HandleMovement();
    }

    private void HandleMovement()
    {
        Vector2 inputVector = gameInput.GetMovementVectorNormalized();

        Vector3 moveDir = new Vector3(inputVector.x, inputVector.y, 0f);

        transform.position += moveDir * moveSpeed * Time.deltaTime;
    }
}
