package
{
	import flash.events.Event;

	public class RecipeEvent extends Event
	{
		public static const CREATED:String = "recipeCreated";
		public static const UPDATED:String = "recipeUpdated";
		public static const DELETED:String = "recipeDeleted";
	
		public var recipe:Recipe;
		
		public function RecipeEvent(type:String, recipe:Recipe, bubbles:Boolean = true, cancelable:Boolean = false)
   	{
   		this.recipe = recipe;
			super(type, bubbles, cancelable);
		}
	}
}